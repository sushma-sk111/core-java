class Tv
{
	String display;
	Speaker speaker;
	
	Tv(String speaker)
	{
		this.display=display;
	}
	Tv(Speaker speaker)
	{
		
		this.speaker=speaker;
	}
	
	void Tvinfo()
	{
		System.out.println("tv display:"+this.display);
		System.out.println("speaker:"+this.speaker);
		if(this.speaker!=null)
		{
			System.out.println("Max Volume :"+this.speaker.maxVolume);
		}

	}
}