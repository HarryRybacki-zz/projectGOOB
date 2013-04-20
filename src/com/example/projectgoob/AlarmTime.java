package com.example.projectgoob;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TimePicker;

public class AlarmTime implements Parcelable , Comparable<AlarmTime>{
	private int hour;
	private int minute;
	
	public AlarmTime(TimePicker t)
	{
		this.hour=t.getCurrentHour();
		this.minute = t.getCurrentMinute();
	}
	
	public AlarmTime(int hour, int min)
	{
		this.hour=hour;
		this.minute=min;
	}
	
	
	public String toString()
	{
		String ret = this.hour+":"+this.minute;
		return ret;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getHour()
	{
		return this.hour;
	}
	
	public int getMinute()
	{
		return this.getMinute();
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		// TODO Auto-generated method stub
		out.writeInt(hour);
		out.writeInt(minute);
	}

	public static final Parcelable.Creator<AlarmTime> CREATOR= new Parcelable.Creator<AlarmTime>() 
			{
				@Override
				public AlarmTime createFromParcel(Parcel source) {
					// TODO Auto-generated method stub
					return new AlarmTime(source);
				}

				@Override
				public AlarmTime[] newArray(int size) {
					// TODO Auto-generated method stub
					return new AlarmTime[size];
				}
			};
			
			private AlarmTime(Parcel in)
			{
				
				this.hour = in.readInt();
				this.minute = in.readInt();
			}

			
			@Override
			public int compareTo(AlarmTime another) {
				// TODO Auto-generated method stub
				if(this.hour==another.hour && this.minute==another.minute)
				{
					return 0;
				}
				else 
				{
					return 1;
				}
				//TODO implement greater or less than
			}
}
