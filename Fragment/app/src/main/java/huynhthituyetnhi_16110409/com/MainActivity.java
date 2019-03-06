package huynhthituyetnhi_16110409.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BottomFragment bottomFragment ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Hàm getSupportFragmentManager : Để quản lí phân đoạn trong hoạt động của mình
    // findFragmentById => Trỏ tới fragment thông qua id

    public void showText(String topImageText, String bottomImageText) {
       bottomFragment
                = (BottomFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.bottom_fragment);
        bottomFragment.showText(topImageText, bottomImageText);
    }
}
//Lớp FragmentManager cho phép thêm, xóa, thay thế fragment trong layout của activity.
//Sử dụng getSupportFragmentManager để lấy một đối tương Fgmanager.
