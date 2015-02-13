package jp.pmw.migration.tmp;

import jp.pmw.migration.object.Room;

public class TMP_ROOM_MST extends BaseTmp{
	private Room r;

	public TMP_ROOM_MST(Room r){
		this.r = r;
	}

	public void setTmpRoomMst(Room r){
		this.r = r;
	}

	public String getUNIVERSITY_NAME(){
		return this.r.universityName;
	}

	public String getCAMPUS_NAME(){
		return this.r.campusName;
	}

	public String getBUILDING_NAME(){
		return this.r.buildingName;
	}

	public String getROOM_NAME(){
		return this.r.roomName;
	}

	public String getSEAT_COUNT(){
		String seat = this.r.seatCount;
		//座席数情報が食う文字の場合
		if(seat.equals("")){
			seat = null;
		}
		return seat;
	}

	public String toString(){
		return "大学名:"+getUNIVERSITY_NAME()+","+"キャンパス名:"+getCAMPUS_NAME()+",建物名:"+getBUILDING_NAME()+",教室名:"+getROOM_NAME();
	}
}
