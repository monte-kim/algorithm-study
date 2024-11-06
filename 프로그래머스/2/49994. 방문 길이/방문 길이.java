import java.util.*;

class Solution {
    public int solution(String dirs) {
        int startX = 0;
        int startY = 0;
        HashSet<Path> visited = new HashSet<>();

        char[] directions = dirs.toCharArray();
        for (char direction : directions) {
            int nextX = startX;
            int nextY = startY;

            switch (direction) {
                case 'U':
                    nextY = startY + 1;
                    break;
                case 'D':
                    nextY = startY - 1;
                    break;
                case 'R':
                    nextX = startX + 1;
                    break;
                case 'L':
                    nextX = startX - 1;
                    break;
                default:
                    break;
            }

            if (nextX < -5 || nextX > 5 || nextY < -5 || nextY > 5) {
                continue;
            }

            visited.add(new Path(startX, startY, nextX, nextY));
            startX = nextX;
            startY = nextY;
        }

        return visited.size();
    }
    
    class Path {
        private final int fromX;
        private final int fromY;
        private final int toX;
        private final int toY;

        private Path(int fromX, int fromY, int toX, int toY) {
            this.fromX = fromX;
            this.fromY = fromY;
            this.toX = toX;
            this.toY = toY;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Path) {
                Path other = (Path) obj;
                return (this.fromX == other.fromX && this.fromY == other.fromY && this.toX == other.toX && this.toY == other.toY)
                        || (this.fromX == other.toX && this.fromY == other.toY && this.toX == other.fromX && this.toY == other.fromY);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(Math.min(fromX, toX), Math.min(fromY, toY), Math.max(fromX, toX), Math.max(fromY, toY));
        }
    }
}