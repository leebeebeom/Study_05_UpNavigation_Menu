package com.beebeom.a05_upnavigation_menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //업 네비게이션을 이용하기 위해서는
        //Manifest 에서 부모액티비티를 정해주면 된다.
        //그러면 왼쪽위에 뒤로가기 버튼으로 부모 액티비티로 이동할 수 있음.
        findViewById(R.id.btn_move_parent).setOnClickListener(v -> {
            startActivity(new Intent(this, Parent.class));
        });
    }

    //왼쪽 위 메뉴 만들기
    //일단 메뉴 레이아웃을 먼저 만들어준다.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //메뉴 인플레이터를 호출하고 인플레이트 해준다.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        //리턴은 트루
        return true;
    }
    //메뉴 클릭 기능

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //item.getItemId로 설정해준 Id를 얻어올 수 있다.
        //스위치문으로 id마다 기능을 만들어 준다
        switch (item.getItemId()) {
            case R.id.menu_move_parent:
                startActivity(new Intent(this, Parent.class));
                break;
            case R.id.menu_move_child:
                startActivity(new Intent(this, Child.class));
                break;
                //break 를 걸어주지 않으면 메뉴 클릭시 다음 메소드들도 다 실행되어 버림.
        }
        //리턴값 트루
        return true;
    }
}