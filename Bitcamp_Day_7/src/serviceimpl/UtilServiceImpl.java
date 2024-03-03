package serviceimpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance = new UtilServiceImpl();
    private UtilServiceImpl(){}
    public static UtilService getInstance() {
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gapOfStartAndEnd) {
        return start + (int)(Math.random() * gapOfStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapOfStartAndEnd) {
        //Math.floor(((150 + Math.random() * 50) * 10) / 10);
        return Math.floor(((start + Math.random() * gapOfStartAndEnd) * 10) / 10);
    }
}
