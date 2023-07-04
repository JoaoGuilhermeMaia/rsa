package com.example;

import com.example.util.RSA;
import com.example.util.RSAKey;

import static com.example.util.RSA.PATH_FILE_DECRYPT;
import static com.example.util.RSA.PATH_FILE_ENCRYPT;

public class Main {

	public static void main(String[] args) {
		final String mensagemOriginal = "Teste teste teste teste";
		RSA.criptografar(mensagemOriginal);
		RSA.descriptografar();

		final String mensagemDescriptografada = RSAKey.readTextFileToString(PATH_FILE_DECRYPT);
		final String mensagemCriptografada = RSAKey.readTextFileToString(PATH_FILE_ENCRYPT);

		printarMensagens(mensagemOriginal, mensagemCriptografada, mensagemDescriptografada);
	}

	private static void printarMensagens(String mensagemOriginal, String mensagemCriptografada,
			String mensagemDescriptografada) {
		System.out.println("Entrada: " + mensagemOriginal);
		System.out.println("Saida: " + mensagemCriptografada);
		System.out.println("Mensagem padrão: " + mensagemDescriptografada);
	}
}
