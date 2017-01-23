package dam.android.appdi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomCardsRecyclerviewAdapter extends RecyclerView.Adapter<CustomCardsRecyclerviewAdapter.CardViewHolder> {

    private List<Resultado> resultados;

    public CustomCardsRecyclerviewAdapter(List<Resultado> resultados) {
        this.resultados = resultados;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_card, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.getTextView().setText(resultados.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return resultados.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        CardViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.cardText);
        }

        public TextView getTextView() {
            return text;
        }
    }
 }
