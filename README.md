# CaldroidCalendar
## Caldroid calendar project is constructed for adding events and display it on calendar so user can easily find the event on calendar.

![Alt text](https://github.com/GrvTakte/CaldroidCalendar/blob/master/Screen%20Shot%202017-05-04%20at%206.26.07%20PM.png?raw=true "Optional Title")

# What is done 

1. add compile 'com.roomorama:caldroid:3.0.1' to gradle build file.
2. add below code to your activity so you can able to display Caldroid calendar on application screen.
''' java
	CaldroidFragment caldroidFragment = new CaldroidFragment();
	Bundle args = new Bundle();
	Calendar cal = Calendar.getInstance();
	args.putInt(CaldroidFragment.MONTH, cal.get(Calendar.MONTH) + 1);
	args.putInt(CaldroidFragment.YEAR, cal.get(Calendar.YEAR));
	caldroidFragment.setArguments(args);

	FragmentTransaction t = getSupportFragmentManager().beginTransaction();
	t.replace(R.id.calendar1, caldroidFragment);
	t.commit();
'''
3. Create database to store events so user can easily access events from database.
4. Add database connection to the application.
5. Apply conditions over calendar and database.
6. Now run the CaldroidCalender application.
