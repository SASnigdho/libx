package blog.tech.salman.libx.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.sdsmdg.tastytoast.TastyToast;

import blog.tech.salman.libx.R;

public class DialogController {

    private Context context;

    public DialogController(Context context) {
        this.context = context;
    }

    public void show( boolean isSubject ) {
        AlertDialog.Builder builder = new AlertDialog.Builder( context );
        View dialogView = LayoutInflater.from( context ).inflate( R.layout.model_dialog, null );

        builder.setView( dialogView );
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        TextView titleTv = dialogView.findViewById( R.id.ModelDialogTitleTv );
        EditText nameEdt = dialogView.findViewById( R.id.ModelDialogNameEdt );

        /* If subject true data save to subject list else to category */
        if (isSubject) {
            titleTv.setText( "Add Subject" );
            nameEdt.setHint( "Subject Name" );
        } else {
            titleTv.setText( "Add Member Category" );
            nameEdt.setHint( "Category Name" );
        }


        dialogView.findViewById( R.id.ModelDialogCancelBtn ).setOnClickListener( v1 -> {
            alertDialog.dismiss();
        } );

        dialogView.findViewById( R.id.ModelDialogSaveBtn ).setOnClickListener( v12 -> {
            TastyToast.makeText( context, nameEdt.getText().toString().trim(), TastyToast.LENGTH_SHORT, TastyToast.SUCCESS );
        } );

    }
}
