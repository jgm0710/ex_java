package kr.ac.mjc.gumin.java.exceptions;

public class ACM_HotelManager {
	//직사각형 모양의 호텔의 규격을 입력 받아서 객실을 배정하는 단순 예제입니다.
	//호텔 좌측에는 엘리베이터가 있고 좌측하단부터 우측상단의 대각으로 갈수록 객실 호수가 증가한다고 가정합니다.
	//손님이 걷는 거리를 최소화 하도록 객실 배정을 한다고 가정할 때 
	//손님이 배정 받게 되는 객실은 몇호인지 계산하는 예제입니다.
	//단 엘리베이터의 이동거리는 무시하도록 하고 
	//걷는 거리가 같을 경우 낮은 층을 선호한다는 가정입니다.
	//객실보다 손님 수가 많을 경우 예외처리를 하도록 처리하였습니다.
	
	private int height;		
	private int width;		
	private int guests;
	
	public ACM_HotelManager() {}
	
	public ACM_HotelManager(int height, int width, int guests) {
		setHeight(height);
		setWidth(width);
		setGuests(guests);
	}

	public void room() throws GuestsOverRoomsException{
		if (guests > height * width)
			throw new GuestsOverRoomsException("\n호텔의 객실 수 보다 손님이 더 많습니다. \n 객실 수 : " + height*width + " 손님 수 : "+guests+"\n");
		else {
			int tmp_h, tmp_w;

			tmp_h = 0;
			tmp_w = 1;

			for (int j = 0; j < guests; j++) {
				tmp_h++;
				if (tmp_h > height) {
					tmp_h = 1;
					tmp_w++;
				}
			}
			if (tmp_w < 10)
				System.out.format("%d번 손님은 %d0%d호 객실을 배정해 드리겠습니다.\n",guests, tmp_h, tmp_w);
			else
				System.out.format("%d번 손님은 %d%d호 객실을 배정해 드리겠습니다.\n",guests, tmp_h, tmp_w);
		}

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

}
