package x40117680.napier.ac.uk.seism;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BikeCardAdapter extends RecyclerView.Adapter<BikeCardAdapter.ViewHolder>{
    List<Bike> mBikes;

    public BikeCardAdapter(){
        super();
        mBikes = new ArrayList<Bike>();
        Bike bike = new Bike("Giant Reign","160mm",R.drawable.header_profile_picture);
        mBikes.add(bike);
        bike=new Bike("Santa Cruz Bronson","150mm",R.drawable.header_profile_picture);
        mBikes.add(bike);
        bike=new Bike("Transition Patrol","160mm",R.drawable.header_profile_picture);
        mBikes.add(bike);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.history_fragment_card_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Bike bike = mBikes.get(i);
        viewHolder.tvCardMain.setText(bike.getName());
        viewHolder.tvCardSub.setText(bike.getTravel());
        viewHolder.imgThumbnail.setImageResource(bike.getImage());
    }

    @Override
    public int getItemCount() {
        return mBikes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvCardMain;
        public TextView tvCardSub;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.card_view_image);
            tvCardMain = (TextView)itemView.findViewById(R.id.card_view_main_text);
            tvCardSub = (TextView)itemView.findViewById(R.id.card_view_sub_text);
        }
    }
}
