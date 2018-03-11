package com.nenaner.katas.clockwisespiral;

public class ClockwiseSpiralApplication {
    private Integer[][] spiral;
    private int lastNumberWritten;
    private int sizeOfSpiral;

    public Integer[][] generateSpiral(int sizeOfSpiralToGenerate) {
        spiral = new Integer[sizeOfSpiralToGenerate][sizeOfSpiralToGenerate];
        lastNumberWritten = 0;
        sizeOfSpiral = sizeOfSpiralToGenerate;
        writeTopRow();
        writeRightRow();
        writeBottomRow();
        return spiral;
    }

    private void writeTopRow() {
        for (int x = 0; x < sizeOfSpiral; x++) {
            spiral[0][x] = ++lastNumberWritten;
        }
    }

    private void writeRightRow() {
        for (int x = 0; x < sizeOfSpiral; x++) {
            if (spiral[x][sizeOfSpiral - 1] == null) {
                spiral[x][sizeOfSpiral - 1] = ++lastNumberWritten;
            }
        }
    }

    private void writeBottomRow() {
        for (int x = sizeOfSpiral - 1; x >= 0; x--) {
            if (spiral[sizeOfSpiral - 1][x] == null) {
                spiral[sizeOfSpiral - 1][x] = ++lastNumberWritten;
            }
        }
    }
}
