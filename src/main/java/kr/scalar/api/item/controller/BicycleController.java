package kr.scalar.api.item.controller;

import kr.scalar.api.item.domain.BicycleDto;
import kr.scalar.api.item.service.BicycleService;
import kr.scalar.api.item.service.impl.BicycleServiceImpl;
import kr.scalar.api.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicycleController extends LambdaUtils {

    private BicycleService bicycleService;

    public BicycleController(){
        bicycleService = new BicycleServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        BicycleDto bicycle = null;
        while(true){
            print.accept("\n[메뉴] 0-종료 1-등록 2-목록\n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    bicycle = new BicycleDto();
                    print.accept("기어가 몇단 입니까? ");
                    bicycle.setGear(scanner.next());
                    print.accept("페달은 무엇입니까? ");
                    bicycle.setPedal(scanner.next());
                    print.accept("속도는 얼마입니까? ");
                    bicycle.setSpeed(scanner.next());
                    bicycleService.add(bicycle);
                    break;
                case "2":
                    List<? extends BicycleDto> list = bicycleService.show();
                    for(BicycleDto b : list){
                        print.accept(b.toString());
                    }
            }
        }


    }
}
