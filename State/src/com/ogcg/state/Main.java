package com.ogcg.state;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner is = new Scanner( System.in );
        Button btn = new Button();
        while (true) {
            System.out.print("Press 'Enter'");
            is.nextLine();
            btn.push();
        }
	}

}
