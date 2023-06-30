package p05;

public class SongExec {
	
	public static void main(String[] args) {
		
		
		Song[] songs=new Song[5];
		
	
		
		songs[0]=new Song();
		songs[0].name="희재";
		songs[0].singer="성시경";
		songs[0].rank=1;
		
		songs[1]=new Song();
		songs[1].name="야생화";
		songs[1].singer="박효신";
		songs[1].rank=2;
		
		songs[2]=new Song();
		songs[2].name="골목대장 뽀로로";
		songs[2].singer="노진구";
		songs[2].rank=3;
		
		songs[3]=new Song();
		songs[3].name="내가 아니라도";
		songs[3].singer="주호";
		songs[3].rank=42;
		
		songs[4]=new Song();
		songs[4].name="그대를 사랑하는 10가지 이유";
		songs[4].singer="이석훈";
		songs[4].rank=5;
		
		Song fSong=songs[0];
		Song lSong=songs[0];
		
		for(int i=1;i<songs.length;i++) {
			if(fSong.rank>songs[i].rank) {
				fSong=songs[i];
			}
			if(lSong.rank<songs[i].rank) {
				lSong=songs[i];
			}
		}
		System.out.println("1등은 "+fSong.singer+"의 "+fSong.name+"입니다.");
		System.out.println("꼴등은 "+lSong.singer+"의 "+lSong.name+"입니다.");
		
		
	}

}
