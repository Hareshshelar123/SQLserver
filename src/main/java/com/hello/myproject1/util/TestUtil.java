package com.hello.myproject1.util;

import org.jasypt.encryption.StringEncryptor;

import com.hello.myproject1.configuration.CustomJasyptConfig;

public class TestUtil {
	public static void main(String[] args) {
		CustomJasyptConfig obj=new CustomJasyptConfig();
		StringEncryptor encryptor =obj.getPasswordEncryptor();
		String username="sa";
		String password="Haresh1999";
		String StringUsername=encryptor.encrypt(username);
		String Stringpassword=encryptor.encrypt(password);
		System.out.println("encrypted username -"+StringUsername);
		System.out.println("encrypted password -"+Stringpassword);
		
				
	}

}
