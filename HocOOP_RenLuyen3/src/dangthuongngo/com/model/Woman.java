package dangthuongngo.com.model;

import java.util.Date;

public class Woman extends Person {
	private boolean wearingMakeup;
	public boolean isWearingMakeup() {
		return wearingMakeup;
	}

	public void setWearingMakeup(boolean wearingMakeup) {
		this.wearingMakeup = wearingMakeup;
	}

	@Override
	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAgesAsDay() {
		// TODO Auto-generated method stub
		return 0;
	}


}
