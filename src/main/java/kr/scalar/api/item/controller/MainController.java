package kr.scalar.api.item.controller;

import kr.scalar.api.bank.controller.BankController;
import kr.scalar.api.item.controller.BicycleController;
import kr.scalar.api.item.controller.DogController;
import kr.scalar.api.item.controller.MathController;
import kr.scalar.api.util.controller.UtilController;
import kr.scalar.api.item.controller.HimartController;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n[메뉴] 0.종료 1.유틸 2.수학 3.개 4.자전거  5.하이마트 6.은행\n");
            switch (scanner.next()){
                case "0": return;
                case "1": new UtilController().main();break;
                case "2": new MathController().main();break;
                case "3": new DogController().main(); break;
                case "4": new BicycleController().main();break;
                case "5": new HimartController().main();break;
                case "6": new BankController().main();break;

            }
        }
    }
}
