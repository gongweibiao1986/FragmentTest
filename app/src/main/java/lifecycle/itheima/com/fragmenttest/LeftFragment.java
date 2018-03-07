package lifecycle.itheima.com.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ken on 2018/3/7.
 */

public class LeftFragment extends Fragment {
    //当碎片和活动建立关联的时候调用
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
    //为碎片创建视图（加载布局）时调用
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment,container,false);
        return view;
    }
    //确保与碎片相关联的活动一定已经创建完毕的时候调用
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    //当与碎片关联的视图被移除的时候调用
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    //当碎片和活动接触关联的时候调用
    @Override
    public void onDetach() {
        super.onDetach();
    }
}
