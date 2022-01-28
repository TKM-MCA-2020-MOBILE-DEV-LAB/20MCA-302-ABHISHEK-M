<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#D3C54D"
    android:textAlignment="center"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/rs"
        android:layout_width="194dp"
        android:layout_height="31dp"
        android:textAlignment="center"
        android:textAllCaps="true"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.847"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.098" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="281dp"
        android:layout_height="43dp"
        android:text="Calculator"
        android:textAlignment="center"
        android:textAllCaps="true"
        android:textSize="34sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.562"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.022" />

    <TextView
        android:id="@+id/opp"
        android:layout_width="320dp"
        android:layout_height="32dp"
        android:textAlignment="textEnd"
        android:textAllCaps="true"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.637"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.175" />

    <androidx.gridlayout.widget.GridLayout
        android:layout_width="372dp"
        android:layout_height="510dp"
        android:layout_marginStart="2dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="2dp"
        android:layout_marginBottom="17dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/opp">

        <Button
            android:id="@+id/ac"
            android:layout_width="126dp"
            android:layout_height="62dp"
            android:onClick="clear"
            android:text="AC"
            app:layout_column="0"
            app:layout_row="5"
            tools:text="AC" />

        <Button
            android:id="@+id/clear"
            android:layout_width="126dp"
            android:layout_height="62dp"
            android:onClick="clear"
            android:text="C"
            app:layout_column="2"
            app:layout_row="5"
            tools:text="C" />

        <Button
            android:id="@+id/n9"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="nine"
            android:text="9"
            app:layout_column="0"
            app:layout_row="0" />

        <Button
            android:id="@+id/equal"
            android:layout_width="126dp"
            android:layout_height="62dp"
            android:onClick="equal"
            android:text="="
            app:layout_column="1"
            app:layout_row="5" />

        <Button
            android:id="@+id/per"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="per"
            android:text="%"
            app:layout_column="2"
            app:layout_row="4" />

        <Button
            android:id="@+id/div"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="div"
            android:text="/"
            app:layout_column="1"
            app:layout_row="4" />

        <Button
            android:id="@+id/sub"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="sub"
            android:text="-"
            app:layout_column="2"
            app:layout_row="3" />

        <Button
            android:id="@+id/mul"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="mul"
            android:text="*"
            app:layout_column="0"
            app:layout_row="4" />

        <Button
            android:id="@+id/sum"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="add"
            android:text="+"
            app:layout_column="1"
            app:layout_row="3" />

        <Button
            android:id="@+id/n0"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="zero"
            android:text="0"
            app:layout_column="0"
            app:layout_row="3" />

        <Button
            android:id="@+id/n1"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="one"
            android:text="1"
            app:layout_column="2"
            app:layout_row="2" />

        <Button
            android:id="@+id/n2"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="two"
            android:text="2"
            app:layout_column="1"
            app:layout_row="2" />

        <Button
            android:id="@+id/n3"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="three"
            android:text="3"
            app:layout_column="0"
            app:layout_row="2" />

        <Button
            android:id="@+id/n4"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="four"
            android:text="4"
            app:layout_column="2"
            app:layout_row="1" />

        <Button
            android:id="@+id/n5"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="five"
            android:text="5"
            app:layout_column="1"
            app:layout_row="1" />

        <Button
            android:id="@+id/n6"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="six"
            android:text="6"
            app:layout_column="0"
            app:layout_row="1" />

        <Button
            android:id="@+id/n7"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="seven"
            android:text="7"
            app:layout_column="2"
            app:layout_row="0" />

        <Button
            android:id="@+id/n8"
            android:layout_width="130dp"
            android:layout_height="90dp"
            android:onClick="eight"
            android:text="8"
            app:layout_column="1"
            app:layout_row="0" />
    </androidx.gridlayout.widget.GridLayout>

</androidx.constraintlayout.widget.ConstraintLayout>