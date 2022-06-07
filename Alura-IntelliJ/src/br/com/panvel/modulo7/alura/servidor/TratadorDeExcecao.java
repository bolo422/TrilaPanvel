package br.com.panvel.modulo7.alura.servidor;

import java.lang.Thread.UncaughtExceptionHandler;

public class TratadorDeExcecao implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread thread, Throwable ex) {
		System.out.println("Exceção na thread " + thread.getName() + ": " + ex.getMessage());
	}
}