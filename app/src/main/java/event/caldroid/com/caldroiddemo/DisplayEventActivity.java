package event.caldroid.com.caldroiddemo;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gaurav on 25/04/17.
 */

public class DisplayEventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_events);

        readEvents();
    }

    public void readEvents(){
        LinearLayout linearLayoutRecords = (LinearLayout) findViewById(R.id.linearLayoutEvents);
        linearLayoutRecords.removeAllViews();

        List<ObjectCalendar> calendars = new CalendarController(this).read();

        if (calendars.size() > 0) {

            for (ObjectCalendar obj : calendars) {

                int id = obj.id;
                String date = obj.date;
                String ename = obj.eventname;
                String edescription = obj.eventdescription;

                String textViewContents = date + " - " + ename + " _ " +edescription;

                TextView textViewStudentItem= new TextView(this);
                textViewStudentItem.setPadding(0, 10, 0, 10);
                textViewStudentItem.setText(textViewContents);
                textViewStudentItem.setTag(Integer.toString(id));

                linearLayoutRecords.addView(textViewStudentItem);
            }

        }

        else {

            TextView locationItem = new TextView(this);
            locationItem.setPadding(8, 8, 8, 8);
            locationItem.setText("No events yet.");

            linearLayoutRecords.addView(locationItem);
        }
    }
}

