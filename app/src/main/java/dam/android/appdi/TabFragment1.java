package dam.android.appdi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TabFragment1 extends Fragment {

    protected RecyclerView mRecyclerView;
    protected CustomRecyclerViewAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected String[] mDataSet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateDataSet();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_1, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager((getActivity()));

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        int scrollPosition = 0;
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        }
        mRecyclerView.scrollToPosition(scrollPosition);

        mAdapter = new CustomRecyclerViewAdapter(mDataSet);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    /**
     * Testing method to populate the dataset with sample data.
     * TODO: remove when unnecessary.
     */
    private void populateDataSet() {
        mDataSet = new String[50];
        for (int i = 0; i < 50; i++) {
            mDataSet[i] = "Result " + i;
        }
    }
}