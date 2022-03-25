package com.example.tugas_3putrarivaldo;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSEkaHospital extends ListActivity

{
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center", "SMS Center", "Driving Direction", "Website", "Info Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listAct));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")){
                String nomortelp = "tel:081266493355   ";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortelp));

            } else if (pilihan.equals("SMS Center")) {
                String smsText = "Putra Rivaldo";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081266493355"));
                a.putExtra("sms_body", smsText);

            } else if (pilihan.equals("Driving Direction")){

                String rslokasi = "google.navigation:FCM9+7R9";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(rslokasi));


            } else if (pilihan.equals("Website")) {

                String website = "https://www.ekahospital.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));


            }else if (pilihan.equals("Info Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Eka Hospital");

            }else if (pilihan.equals("Exit")){
                String keluar = "Terimakasih";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(keluar));
            }

            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
