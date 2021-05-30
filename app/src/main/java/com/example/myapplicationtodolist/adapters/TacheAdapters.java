package com.example.myapplicationtodolist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationtodolist.R;
import com.example.myapplicationtodolist.adapters.TacheAdapters;
import com.example.myapplicationtodolist.models.Taches;

import java.util.List;

public class TacheAdapters extends RecyclerView.Adapter<TacheAdapters.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder  {
        private TextView tv_tache;
        private TextView tv_priorite, tv_times;
        private Button Btfait;

        public ViewHolder(@NonNull View view) {
            super(view);

            tv_tache = view.findViewById(R.id.layoutTaches);
            tv_times = view.findViewById(R.id.layoutTimes);
            tv_priorite = view.findViewById(R.id.sp_Priority);
            Btfait = view.findViewById(R.id.layoutBtFait);

        }

        public TextView getTv_tache() {
            return tv_tache;
        }

        public void setTv_tache(TextView tv_tache) {
            this.tv_tache = tv_tache;
        }

        public TextView getTv_priorite() {
            return tv_priorite;
        }

        public void setTv_priorite(TextView tv_priorite) {
            this.tv_priorite = tv_priorite;
        }

        public TextView getTv_times() {
            return tv_times;
        }

        public void setTv_times(TextView tv_times) {
            this.tv_times = tv_times;
        }

        public Button getBtfait() {
            return Btfait;
        }

        public void setBtfait(Button btfait) {
            Btfait = btfait;
        }
    }
    private List<Taches> dataSet; // Utilisation du type interface (Découplage)
    private Context context;

    public TacheAdapters(Context context, List<Taches> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }
    @NonNull
    @Override
    public TacheAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_recycleur, parent, false);
        return new TacheAdapters.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TacheAdapters.ViewHolder holder, int position) {
        Taches tache = dataSet.get(position);

        holder.getTv_tache().setText(tache.getTaches());
        holder.getTv_priorite().setText(tache.getPriority());



    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}

