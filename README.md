<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Income">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp">


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center">

            <ImageButton
                android:id="@+id/imageButton"
                android:layout_width="72dp"
                android:layout_height="72dp"
                android:backgroundTint="@color/teal_200"
                app:srcCompat="@android:drawable/ic_menu_edit"
                android:contentDescription="Edit Button" />

            <ImageButton
                android:id="@+id/image1"
                android:layout_width="72dp"
                android:layout_height="72dp"
                android:layout_marginStart="16dp"
                android:backgroundTint="@color/black"
                android:contentDescription="Delete Button"
                app:srcCompat="@android:drawable/ic_menu_delete" />
        </LinearLayout>

      
        <TextView
            android:id="@+id/textView1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="32dp"
            android:text="Income Type"
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="@android:color/black" />


        <EditText
            android:id="@+id/editTextNumber"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:hint="category"
            android:inputType="number" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="32dp"
            android:text="Income "
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="@android:color/black" />


        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/editTextAmount"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Amount"
                android:inputType="numberDecimal" />
        </com.google.android.material.textfield.TextInputLayout>


        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"/>

        
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginTop="16dp">

            

            
            <EditText
                android:id="@+id/dateEditText"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerHorizontal="true"
                android:layout_marginTop="50dp"
                android:clickable="true"
                android:focusable="false"
                android:hint="Select Date" />


            <ImageButton
                android:id="@+id/pickDateButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_below="@id/dateEditText"
                android:layout_centerHorizontal="true"
                android:layout_marginVertical="50dp"
                android:layout_marginTop="20dp"
                android:src="@android:drawable/ic_menu_day"
                android:text="Pick Date" />

            <EditText
                android:id="@+id/timeEditText"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_below="@id/pickDateButton"
                android:layout_centerHorizontal="true"
                android:layout_marginVertical="50dp"
                android:layout_marginHorizontal="20dp"
                android:layout_marginTop="20dp"
                android:clickable="true"
                android:focusable="false"
                android:hint="Select Time" />

            <ImageButton
                android:id="@+id/pickTimeButton"
                android:layout_width="wrap_content"
                android:layout_height="44dp"
                android:layout_below="@id/timeEditText"
                android:layout_centerHorizontal="true"
                android:layout_marginTop="20dp"
                android:Layout_marginvertical="50dp"
                android:src="@android:drawable/arrow_down_float"
                android:text="Pick Time" />
        </LinearLayout>


        <Button
            android:id="@+id/button"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="32dp"
            android:text="Done"
            android:backgroundTint="@color/teal_200"
            android:textColor="@android:color/white" />

    </LinearLayout>
</ScrollView>
