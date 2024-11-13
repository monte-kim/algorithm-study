import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genrePlaysMap = new HashMap<>();
        HashMap<String, ArrayList<Song>> genreSongPlaysMap = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {
            // 각 장르별로 재생된 횟수 저장
            genrePlaysMap.put(genres[i], genrePlaysMap.getOrDefault(genres[i], 0) + plays[i]);

            Song song = new Song(i, plays[i]);
            if (!genreSongPlaysMap.containsKey(genres[i])) {
                genreSongPlaysMap.put(genres[i], new ArrayList<>());
            }
            genreSongPlaysMap.get(genres[i]).add(song);
        }

        List<Map.Entry<String, Integer>> genrePlaysList = new ArrayList<>(genrePlaysMap.entrySet());
        genrePlaysList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> genrePlays : genrePlaysList) {
            String genre = genrePlays.getKey(); // 정렬된 순서로 장르 추출
            ArrayList<Song> genreSongs = genreSongPlaysMap.get(genre);
            genreSongs.sort(new SongComparator()); // 장르 내 곡들 순위 정렬
            result.add(genreSongs.get(0).getId());
            if (genreSongs.size() > 1) {
                result.add(genreSongs.get(1).getId());
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    class Song {
        private int id;
        private int plays;

        public Song(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }

        public int getId() {
            return id;
        }

        public int getPlays() {
            return plays;
        }
    }

    class SongComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            if (o1.getPlays() < o2.getPlays()) {
                return 1;
            } else if (o1.getPlays() > o2.getPlays()) {
                return -1;
            } else {
                return o1.getId() - o2.getId();
            }
        }
    }
}