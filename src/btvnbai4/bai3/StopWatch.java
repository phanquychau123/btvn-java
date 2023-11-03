package btvnbai4.bai3;

import java.util.Date;

    public class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

    }

