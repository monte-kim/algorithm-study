import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> trucksWaiting = new ArrayDeque<>();
        for (int truckWeight : truck_weights) {
            Truck truck = new Truck(bridge_length, truckWeight);
            trucksWaiting.add(truck);
        }

        int seconds = 0;
        int bridgeWeight = 0; // 다리 위 트럭들 무게 총합
        ArrayList<Truck> trucksOnBridge = new ArrayList<>(); // 다리 위 트럭들
        while (!trucksWaiting.isEmpty() || !trucksOnBridge.isEmpty()) {
            // 대기하고 있는 트럭이 있어

            seconds++; // 시간 재기

            if (!trucksWaiting.isEmpty() && trucksOnBridge.size() < bridge_length && bridgeWeight + trucksWaiting.peek().getWeight() <= weight) {
                // 다리 위에 자리가 남았어 && 다리가 다음 트럭 무게까지 견딜 수 있어
                Truck nextTruck = trucksWaiting.poll();

                if(trucksWaiting.isEmpty()){
                    seconds += bridge_length;
                    break;
                }

                trucksOnBridge.add(nextTruck); // 다음 트럭 투입!
                bridgeWeight += nextTruck.getWeight(); // 다리 무게 증가
            }

            Iterator<Truck> iterator = trucksOnBridge.iterator();
            while (iterator.hasNext()) {
                Truck truck = iterator.next();
                truck.move(); // 다리 위 트럭 모두 1칸씩 이동

                if (truck.getMovesLeft() == 0) {
                    iterator.remove(); // 다리에서 트럭 제거
                    bridgeWeight -= truck.getWeight(); // 다리 무게 감소
                }
            }
        }

        return seconds;
    }

    class Truck {
        private int movesLeft;
        private final int weight;

        public Truck(int movesLeft, int weight) {
            this.movesLeft = movesLeft;
            this.weight = weight;
        }

        public void move() {
            movesLeft--;
        }

        public int getMovesLeft() {
            return movesLeft;
        }

        public int getWeight() {
            return weight;
        }
    }
}