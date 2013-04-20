package com.example.projectgoob;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
public class AlarmList implements Parcelable {
	private ArrayList<PendingIntent> intentsList;
	
	public AlarmList()
	{
		intentsList = new ArrayList<PendingIntent>();
	}
	
	public int size()
	{
		return intentsList.size();
	}
	
	public void add(PendingIntent intent)
	{
		intentsList.add(intent);
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		// TODO Auto-generated method stub
		out.writeList(intentsList);
	}	
	
	
	public PendingIntent get(int index)
	{
		return intentsList.get(index);
	}
	
	public static final Parcelable.Creator<AlarmList> CREATOR = new Parcelable.Creator<AlarmList>() 
		{

			@Override
			public AlarmList createFromParcel(Parcel source) {
				// TODO Auto-generated method stub
				return new AlarmList(source);
			}

			@Override
			public AlarmList[] newArray(int size) {
				// TODO Auto-generated method stub
				return new AlarmList[size];
			}
		
		};
		
		private AlarmList(Parcel in)
		{
			intentsList = in.readArrayList(PendingIntent.class.getClassLoader());
		}
	
	
}
