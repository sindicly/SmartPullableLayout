package com.example.it_android.smartpullablelayout;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class MainActivity extends AppCompatActivity {


    private SmartRefreshLayout mRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRefreshLayout = findViewById(R.id.smartRefreshLayout);
        mRefreshLayout.finishRefresh(3000);

        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {//下拉刷新
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {


            }
        }).setOnLoadMoreListener(new OnLoadMoreListener() {//上拉加载
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

            }
        });

    }
}
