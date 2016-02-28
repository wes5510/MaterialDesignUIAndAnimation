package com.example.wes.materialdeisignuiandanimation.ui.CollapsingToolbar;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.wes.materialdeisignuiandanimation.R;

public class CollapsingToolbarAndScrollview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_and_scrollview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapseToolbarLayout);
        collapsingToolbar.setTitle("Tittle");

        TextView textview = (TextView) findViewById(R.id.textview);

        textview.setText("한국 CA 테크놀로지스(www.ca.com/kr)는 아태 및 일본지역 대다수 기업(69%)이 데브옵스(DevOps)를 적용하고 있으며 그 가운데 15%는 이미 상당 수준의 데브옵스를 실행 중이라 밝혔다.\n" +
                "\n" +
                "데브옵스는 개발(Development)과 운영(Operation)을 결합한 말로 개발 조직과 운영 조직이 긴밀히 연계ㆍ협업해 소프트웨어 및 서비스를 빠르게 개발하고 배포함을 목적으로 한다.\n" +
                "\n" +
                "한국의 경우 데브옵스 적용 비율은 56%로 나타났다. 한국 기업은 데브옵스 적용 주된 이유로 ▲증가하는 고객 요구사항 대응 ▲새롭고 혁신적인 고객 경험 창출 ▲IT를 통한 보다 적극적인 가치 기여를 꼽았다.\n" +
                "\n" +
                "\n" +
                "\n" +
                "이번 조사는 CA 테크놀로지스 의뢰를 받아 IT 산업 분석기관 프리폼 다이나믹스가 전세계 16개국 9개 산업 1442명의 IT 및 비즈니스 고위 임원을 대상으로 진행했다. 온라인 설문과 함께 심층 전화 인터뷰 방식을 병행했다.\n" +
                "\n" +
                "조사에 따르면 글로벌 데브옵스 선진 적용 기업은 디지털화 계획(Digital Initiatives)을 추진해 비즈니스 경쟁력 강화, 고객 유지, 매출과 이익을 끌어올린 것으로 나타났다. 전 세계적으로 데브옵스 성숙도를 갖춘 기업은 데브옵스를 도입하지 않은 기업보다 매출 증대 확률은 2배, 이익 증대 확률은 2.4배 높았다.\n" +
                "\n" +
                "아태 및 일본지역 데브옵스 선진 적용 기업은 데브옵스를 도입하지 않는 기업과 비교해 시장 점유율 증진(3배), 고객 수익성 개선(2.3배), 고객 유지(2.2배), 신규 수입원 창출(2.2배), 고객 창출(2배) 확률을 보였다.\n" +
                "\n" +
                "마이클 최 한국 CA 테크놀로지스 사장은 \"아태 및 일본지역 기업의 데브옵스 도입은 빠르게 증가해 이미 유럽 및 미주 지역에 버금가지만 데브옵스 활용 수준은 아직 충분치 않다\"며, \"데브옵스 잠재력을 최대한 활용하기 위해 IT 역량을 높이고 협업과 지속적인 혁신을 도모하는 추진동력을 갖춰야 한다\"고 말했다. editor@itworld.co.kr\n" +
                "\n" +
                "Read more: http://www.itworld.co.kr/t/61023/%EA%B0%9C%EB%B0%9C%EC%9E%90/97913#csidxa01c7f683d808c7950e18b0c6c84f98 \n" +
                "Copyright © LinkBack");
    }
}
