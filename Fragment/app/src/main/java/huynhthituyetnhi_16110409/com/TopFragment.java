package huynhthituyetnhi_16110409.com;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment {

    private EditText inputTopImageText ;
    private EditText inputBottomImageText;
    private MainActivity mainActivity ;
    // onCreateView : Hệ thống sẽ gọi pt này đến lúc phân đoạn vẽ giao diện người dùng của nó lần đầu tiên
    //onCreateView => trả ra view là giao diện xml tương ứng vs fragment

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_top,container,false);
        inputTopImageText = (EditText) view .findViewById(R.id.input_top_image_text);
        inputBottomImageText = (EditText) view.findViewById(R.id.input_bottom_image_text);

        Button applyButton = (Button) view.findViewById(R.id.button_apply);

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyText();
            }
        });

        return view;

    }
    // onAttach có chức năng tham chiều từ fragment đến activity đã khới tạo nó
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }
    private void applyText(){
        String topText = this.inputTopImageText.getText().toString();
        String bottomText = this.inputBottomImageText.getText().toString();

        this.mainActivity.showText(topText,bottomText);
    }
}
