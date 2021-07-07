package trial.example.med10;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private Context context;
    private ArrayList<Model> arrayList;

    public Adapter(Context context, ArrayList<Model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.row,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Model model=arrayList.get(position);

        String id=model.getId();
        String image=model.getImage();
        String name=model.getName();
        String address=model.getAddress();
        String phone=model.getPhone();

        holder.profileIv.setImageURI(Uri.parse(image));
        holder.name.setText(name);
        holder.address.setText(address);
        holder.phone.setText(phone);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        ImageView profileIv;
        TextView name,address,phone;

        public Holder(@NonNull View itemView) {
            super(itemView);

            profileIv=itemView.findViewById(R.id.profileIv);
            name=itemView.findViewById(R.id.name);
            address=itemView.findViewById(R.id.address);
            phone=itemView.findViewById(R.id.phone);
        }
    }
}
