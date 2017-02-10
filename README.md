# XRadioGroup
可以实现任意嵌套RadioButton
#Usage 使用

java代码中使用方式与`android.widget.RadioGroup`完全一致

        XRadioGroup xRadioGroup = (XRadioGroup) findViewById(R.id.xRadioGroup);
        xRadioGroup.setOnCheckedChangeListener(new XRadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(XRadioGroup group, @IdRes int checkedId) {
                  Log.d("TAG", checkedId + "is checked");
             }
         });
在xml中你可以里面嵌套使用

        <me.shihao.library.XRadioGroup
                android:id="@+id/xRadioGroup"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_centerHorizontal="true"
                    android:layout_centerVertical="true">

                    <RadioButton
                        android:id="@+id/radioButton"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentLeft="true"
                        android:layout_alignParentStart="true"
                        android:layout_alignParentTop="true"
                        android:checked="true"
                        android:text="New RadioButton"/>

                    <RadioButton
                        android:id="@+id/radioButton2"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentEnd="true"
                        android:layout_alignParentRight="true"
                        android:layout_alignParentTop="true"
                        android:layout_gravity="center_horizontal"
                        android:text="New RadioButton"/>

                    <RadioButton
                        android:id="@+id/radioButton3"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentLeft="true"
                        android:layout_alignParentStart="true"
                        android:layout_below="@+id/radioButton"
                        android:layout_gravity="center_horizontal"
                        android:text="New RadioButton"/>

                    <RadioButton
                        android:id="@+id/radioButton4"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentEnd="true"
                        android:layout_alignParentRight="true"
                        android:layout_alignTop="@+id/radioButton3"
                        android:text="New RadioButton"/>

                    <RadioButton
                        android:id="@+id/radioButton5"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@+id/radioButton3"
                        android:layout_centerHorizontal="true"
                        android:text="New RadioButton"/>

                    <RadioButton
                        android:id="@+id/radioButton6"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignLeft="@+id/radioButton5"
                        android:layout_alignStart="@+id/radioButton5"
                        android:layout_below="@+id/radioButton5"
                        android:text="New RadioButton"/>
                </RelativeLayout>
            </me.shihao.library.XRadioGroup>