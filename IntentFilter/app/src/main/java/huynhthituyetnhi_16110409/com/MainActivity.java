package huynhthituyetnhi_16110409.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String[] recipients = new String[]{"support@tutlane.com"};
    String object = "Welcome to Tutlane" ;
    String content = "Hi Guest, Welcome to Tutlane Tutorial site";
    Button btnSendMail ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * findViewId ánh xạ tới button có id: sendMail
         */
        btnSendMail = (Button) findViewById(R.id.sendMail);
        /**
         * Tạo sự kiện click cho button
         */
        btnSendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                /**
                 * setType("message/rfc822") để gửi mail
                 */
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, recipients);
                si.putExtra(Intent.EXTRA_SUBJECT,object);
                si.putExtra(Intent.EXTRA_TEXT,content);
                startActivity(Intent.createChooser(si,"Choose Mail App"));

            }
        });
    }
}
