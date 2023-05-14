package level_3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution_42579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Music implements Comparable<Music>{
        private String genre;
        private int id;
        private int playCount;
        
        public Music(String genre, int id, int playCount){
            this.genre = genre;
            this.id = id;
            this.playCount = playCount;
        }
        
        @Override
        public int compareTo(Music o){
            if (this.playCount == o.playCount)
                return this.id - o.id;
            return o.playCount - this.playCount;
        }
        
        public String getGenre(){
            return genre;
        }
        
        public int getPlayCount() {
	    	return playCount;
	    }
    }
    public int[] solution(String[] genres, int[] plays) {
        return IntStream
            .range(0, genres.length)
            .mapToObj(i -> new Music(genres[i], i, plays[i]))
            .collect(Collectors.groupingBy(Music::getGenre))
            .entrySet().stream()
            .sorted((e1, e2) -> 
                    e2.getValue().stream()
                    .collect(Collectors.reducing(0, Music::getPlayCount, (a, b) -> a + b))
                    - e1.getValue().stream()
                    .collect(Collectors.reducing(0, Music::getPlayCount, (a, b) -> a + b)))
            .flatMap(m -> m.getValue().stream().sorted().limit(2))
            .mapToInt(m -> m.id)
            .toArray();
    }
}
