package com.nenaner.katas.clockwisespiral;

public class ClockwiseSpiralApplication {
    private Integer[][] spiral;
    private int lastNumberWritten;
    private int sizeOfSpiral;
    private boolean numberWritten;

    public Integer[][] generateSpiral(int sizeOfSpiralToGenerate) {
        spiral = new Integer[sizeOfSpiralToGenerate][sizeOfSpiralToGenerate];
        lastNumberWritten = 0;
        sizeOfSpiral = sizeOfSpiralToGenerate;
        int spiralCount = 0;
        do {
            numberWritten = false;
            writeTopRow(spiralCount);
            writeRightRow(spiralCount);
            writeBottomRow(spiralCount);
            writeLeftRow(spiralCount);
            spiralCount++;
        } while (numberWritten);

        return spiral;
    }

    private void writeTopRow(int spiralCount) {
        for (int x = 0; x < sizeOfSpiral; x++) {
            writeNumberToCellIfEmpty(spiralCount, x);
        }
    }

    private void writeRightRow(int spiralCount) {
        for (int x = 0; x < sizeOfSpiral; x++) {
            writeNumberToCellIfEmpty(x, sizeOfSpiral - spiralCount - 1);
        }
    }

    private void writeBottomRow(int spiralCount) {
        for (int x = sizeOfSpiral - 1; x >= 0; x--) {
            writeNumberToCellIfEmpty(sizeOfSpiral - spiralCount - 1, x);
        }
    }

    private void writeLeftRow(int spiralCount) {
        for (int x = sizeOfSpiral - 1; x >= 0; x--) {
            writeNumberToCellIfEmpty(x, spiralCount);
        }
    }

    private void writeNumberToCellIfEmpty(int x, int y) {
        if (x >= 0 && x < sizeOfSpiral && y >= 0 && y < sizeOfSpiral && spiral[x][y] == null) {
            spiral[x][y] = ++lastNumberWritten;
            numberWritten = true;
        }
    }
}
