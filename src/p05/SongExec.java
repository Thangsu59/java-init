package p05;

public class SongExec {
	
	public static void main(String[] args) {
		
		
		Song[] songs=new Song[5];
		
		int rankMax=0;
		int rankMin=0;
		String maxName;
		String maxSinger;
		String minName;
		String minSinger;
		songs[0]=new Song();
		songs[0].name="희재";
		songs[0].singer="성시경";
		songs[0].rank=1;
		
		songs[1]=new Song();
		songs[1].name="야생화";
		songs[1].singer="박효신";
		songs[1].rank=2;
		
		songs[2]=new Song();
		songs[2].name="사랑하지 않은 것처럼";
		songs[2].singer="버즈";
		songs[2].rank=3;
		
		songs[3]=new Song();
		songs[3].name="내가 아니라도";
		songs[3].singer="주호";
		songs[3].rank=4;
		
		songs[4]=new Song();
		songs[4].name="그대를 사랑하는 10가지 이유";
		songs[4].singer="이석훈";
		songs[4].rank=5;
		
		for(int i=1;i<songs.length;i++) {
			if(songs[i].rank<=rankMax) {
				rankMax=songs[i].rank;
				maxSinger=songs[i].singer;
				maxName=songs[i].name;
				
			}
		}
		for(int i=1;i<songs.length;i++) {
			if(songs[i].rank>rankMin) {
				rankMin=songs[i].rank;
				minSinger=songs[i].singer;
				minName=songs[i].name;
				
			}
		}
	
		System.out.println("1등은 "+songs[rankMax].singer+"의 "+songs[rankMax].name+"입니다.");
		
	
	}

}
