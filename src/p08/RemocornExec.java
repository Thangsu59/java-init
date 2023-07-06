package p08;

public class RemocornExec {

	public static void main(String[] args) {
		
		Remote[] remotes=new Remote[2];
		remotes[0]=new AircornRemocorn();
		remotes[1]=new TvRemocorn();
		
		for(int i=0;i<remotes.length;i++) {
			if(remotes[i] instanceof AircornRemocorn) {
				AircornRemocorn ar=(AircornRemocorn)remotes[i];
				ar.tmUp();
				ar.tmDown();
			}else if(remotes[i] instanceof TvRemocorn) {
				TvRemocorn tv=(TvRemocorn)remotes[i];
				tv.chUp();
				tv.chDown();
			}
			remotes[i].on();
			
			
			remotes[i].off();
		}

	}
	

}
