package huynhthituyetnhi_16110409.com;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class BottomFragment extends Fragment {
    private TextView topText ;
    private TextView bottomText ;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_bottom, container,false);
        topText = (TextView) view.findViewById(R.id.top_image_text);
        bottomText = (TextView) view.findViewById(R.id.bottom_image_text);

        return view;
    }
    public void showText(String topImageText, String bottomImageText){
        topText.setText(topImageText);
        bottomText.setText(bottomImageText);
    }
}
