package com.yidu.sevensecondmall.fragments;

import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.yidu.sevensecondmall.R;

import java.lang.reflect.Field;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/5/11.
 */
public class serviceFragment extends BaseFragment {


    @BindView(R.id.service_txt)
    TextView serviceTxt;

    @Override
    protected int setViewId() {
        return R.layout.service_layout;
    }

    @Override
    protected void findViews(View view) {
        ButterKnife.bind(this, view);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void init() {
        serviceTxt.setText(Html.fromHtml("\n" +
                "\n" +
                "\t服务承诺：</strong>\n" +
                "\n" +
                "商城向您保证所售商品均为正品行货，自营商品开具机打发票或电子发票。凭质保证书及商城发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！\n" +
                "\n" +
                "注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\t权利声明：</strong>\n" +
                "\n" +
                "商城上的所有商品信息、客户评价、商品咨询、网友讨论等内容，是商城重要的经营资源，未经许可，禁止非法转载使用。\n" +
                "\t\n" +
                "\n" +
                "\t\t注：</b>本站商品信息均来自于厂商，其真实性、准确性和合法性由信息拥有者（厂商）负责。本站不提供任何保证，并不承担任何法律责任。\n" +
                "\t</p>\n" +
                "</div>"));
    }

    @Override
    protected void loadData() {

    }


}
