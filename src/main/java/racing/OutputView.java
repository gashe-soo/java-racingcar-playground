package racing;

public class OutputView {

    public void startPrintResult(){
        System.out.println("실행 결과");
    }

    public void printResult(CarsDTO carsDTO){
        for(CarDTO carDTO : carsDTO.getCars()){
            System.out.println(carDTO.getName()+" : "+ convertToFormat(carDTO.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(CarsDTO carsDTO){
        System.out.println(String.join(",",carsDTO.getWinners()));
    }

    private String convertToFormat(int size){
        return new String(new char[size]).replace("\0","-");
    }


}
