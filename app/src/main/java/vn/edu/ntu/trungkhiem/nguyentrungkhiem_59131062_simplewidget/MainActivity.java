package vn.edu.ntu.trungkhiem.nguyentrungkhiem_59131062_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText edtTen, edtNgaySinh, edtSTK;
    RadioGroup rdbGT;
    CheckBox cbPhim, cbNhac, cbCafe, cbONha, cbNauAN;
    Button btnXacNhan;
    String TXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSTK = findViewById(R.id.edtSTK);
        rdbGT = findViewById(R.id.rdbGT);
        cbPhim = findViewById(R.id.cbPhim);
        cbNhac = findViewById(R.id.cbNhac);
        cbCafe = findViewById(R.id.cbCafe);
        cbONha = findViewById(R.id.cbONha);
        cbNauAN = findViewById(R.id.cbNauAn);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    private void addEvent()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                XacNhan();
            }
        });
    }
    private void XacNhan()
    {
        TXacNhan = edtTen.getText().toString() + "\n" + "Ngày Sinh: " + edtNgaySinh.getText().toString()
                + "\n" + "Giới Tính: ";
        if(rdbGT.getCheckedRadioButtonId()==R.id.rdbNam)
            TXacNhan += "Nam" + "\n" + "Sở Thích: ";
        else
            TXacNhan += "Nữ" + "\n" + "Sở Thích: ";
        if(cbPhim.isChecked())
            TXacNhan += "Xem phim; ";
        if(cbNhac.isChecked())
            TXacNhan += "Nghe Nhạc; ";
        if(cbCafe.isChecked())
            TXacNhan += "Đi cafe với bạn bè; ";
        if(cbONha.isChecked())
            TXacNhan += "Ở nhà một mình; ";
        if(cbNauAN.isChecked())
            TXacNhan += "Vào bếp nấu ăn; ";

        TXacNhan += edtSTK.getText().toString();
        Toast.makeText(getApplicationContext(), TXacNhan, Toast.LENGTH_LONG).show();
    }
}
