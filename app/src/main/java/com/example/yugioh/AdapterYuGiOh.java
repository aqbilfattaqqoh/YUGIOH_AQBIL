package com.example.yugioh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterYuGiOh extends RecyclerView.Adapter<AdapterYuGiOh.ViewHolder> {
    private List<ResultsItem> list;
    private Context context;

    public AdapterYuGiOh(Context context, List<ResultsItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterYuGiOh.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterYuGiOh.ViewHolder holder, int position) {
        final ResultsItem ri = list.get( position );
        holder.tvNamaKartu.setText(ri.getNamaKartu());
        holder.tvTipeKartu.setText(ri.getTipeKartu());

        holder.cvklik.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( context, DetailActivity.class );
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // biar bisa muncul 
                i.putExtra("nama_kartu", ri.getNamaKartu());
                i.putExtra( "tipe_kartu", ri.getTipeKartu());
                i.putExtra("des_kartu", ri.getDesKartu());
                i.putExtra("atk_kartu", String.valueOf(ri.getAtkKartu()));
                i.putExtra("def_kartu", String.valueOf(ri.getDefKartu()));
                i.putExtra("att_kartu", ri.getAttKartu());
                context.startActivity(i);
            }
        } );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNamaKartu;
        private TextView tvTipeKartu;
        private CardView cvklik;
        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaKartu = itemView.findViewById(R.id.tv_nama_kartu);
            tvTipeKartu = itemView.findViewById(R.id.tv_tipe_kartu);
            cvklik = itemView.findViewById(R.id.cv_klik);
        }
    }
}
