package com.example.fac;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Test#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Test extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private OnFragmentInteractionListener mListener;

    public Test() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Test.
     */
    // TODO: Rename and change types and number of parameters
    public static Test newInstance(String param1, String param2) {
        Test fragment = new Test();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);

        final Button clear = view.findViewById(R.id.btnC);
        clear.setVisibility(View.INVISIBLE);
        Button submit = view.findViewById(R.id.btn);
        final RadioButton one = view.findViewById(R.id.rb1);
        final RadioButton two = view.findViewById(R.id.rb2);
        final RadioButton three = view.findViewById(R.id.rb3);
        final RadioButton four = view.findViewById(R.id.rb4);
        final RadioButton five = view.findViewById(R.id.rb5);
        final RadioButton six = view.findViewById(R.id.rb6);
        final RadioButton seven = view.findViewById(R.id.rb7);
        final RadioButton eight = view.findViewById(R.id.rb8);
        final RadioButton nine = view.findViewById(R.id.rb9);
        final RadioButton ten = view.findViewById(R.id.rb10);
        final RadioButton eleven = view.findViewById(R.id.rb11);
        final RadioButton twelve = view.findViewById(R.id.rb12);
        final RadioButton thirteen= view.findViewById(R.id.rb13);

        final RadioButton NOne = view.findViewById(R.id.rbn1);
        final RadioButton NTwo = view.findViewById(R.id.rbn2);
        final RadioButton NThree = view.findViewById(R.id.rbn3);
        final RadioButton NFour = view.findViewById(R.id.rbn4);
        final RadioButton NFive = view.findViewById(R.id.rbn5);
        final RadioButton NSix = view.findViewById(R.id.rbn6);
        final RadioButton NSeven = view.findViewById(R.id.rbn7);
        final RadioButton NEight = view.findViewById(R.id.rbn8);
        final RadioButton NNine = view.findViewById(R.id.rbn9);
        final RadioButton NTen = view.findViewById(R.id.rbn10);
        final RadioButton NEleven = view.findViewById(R.id.rbn11);
        final RadioButton NTwelve = view.findViewById(R.id.rbn12);
        final RadioButton NThirteen = view.findViewById(R.id.rbn13);

        final RadioButton SOne = view.findViewById(R.id.rbs1);
        final RadioButton STwo = view.findViewById(R.id.rbs2);
        final RadioButton SThree = view.findViewById(R.id.rbs3);
        final RadioButton SFour = view.findViewById(R.id.rbs4);
        final RadioButton SFive = view.findViewById(R.id.rbs5);
        final RadioButton SSix = view.findViewById(R.id.rbs6);
        final RadioButton SSeven = view.findViewById(R.id.rbs7);
        final RadioButton SEight = view.findViewById(R.id.rbs8);
        final RadioButton SNine = view.findViewById(R.id.rbs9);
        final RadioButton STen = view.findViewById(R.id.rbs10);
        final RadioButton SEleven = view.findViewById(R.id.rbs11);
        final RadioButton STwelve = view.findViewById(R.id.rbs12);
        final RadioButton SThirteen = view.findViewById(R.id.rbs13);

        final TextView tv00=view.findViewById(R.id.tv00);
        final TextView tv01=view.findViewById(R.id.tv01);
        final TextView tv02=view.findViewById(R.id.tv02);
        final TextView tv03=view.findViewById(R.id.tv03);
        final TextView tv04=view.findViewById(R.id.tv04);
        final TextView tv05=view.findViewById(R.id.tv05);
        final TextView tv06=view.findViewById(R.id.tv06);
        final TextView tv07=view.findViewById(R.id.tv07);
        final TextView tv08=view.findViewById(R.id.tv08);
        final TextView tv09=view.findViewById(R.id.tv09);
        final TextView tv010=view.findViewById(R.id.tv010);
        final TextView tv011=view.findViewById(R.id.tv011);
        final TextView tv012=view.findViewById(R.id.tv012);
        final TextView tv013=view.findViewById(R.id.tv013);
        final TextView tv014=view.findViewById(R.id.tv014);

        final TextView tv1=view.findViewById(R.id.tv1);
        final TextView tv2=view.findViewById(R.id.tv2);
        final TextView tv3=view.findViewById(R.id.tv3);
        final TextView tv4=view.findViewById(R.id.tv4);
        final TextView tv5=view.findViewById(R.id.tv5);
        final TextView tv6=view.findViewById(R.id.tv6);
        final TextView tv7=view.findViewById(R.id.tv7);
        final TextView tv8=view.findViewById(R.id.tv8);
        final TextView tv9=view.findViewById(R.id.tv9);
        final TextView tv10=view.findViewById(R.id.tv10);
        final TextView tv11=view.findViewById(R.id.tv11);
        final TextView tv12=view.findViewById(R.id.tv12);
        final TextView tv13=view.findViewById(R.id.tv13);

        tv00.setVisibility(View.INVISIBLE);
        tv01.setVisibility(View.INVISIBLE);
        tv02.setVisibility(View.INVISIBLE);
        tv03.setVisibility(View.INVISIBLE);
        tv04.setVisibility(View.INVISIBLE);
        tv05.setVisibility(View.INVISIBLE);
        tv06.setVisibility(View.INVISIBLE);
        tv07.setVisibility(View.INVISIBLE);
        tv08.setVisibility(View.INVISIBLE);
        tv09.setVisibility(View.INVISIBLE);
        tv010.setVisibility(View.INVISIBLE);
        tv011.setVisibility(View.INVISIBLE);
        tv012.setVisibility(View.INVISIBLE);
        tv013.setVisibility(View.INVISIBLE);
        tv014.setVisibility(View.INVISIBLE);

        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                one.setChecked(false);
                two.setChecked(false);
                three.setChecked(false);
                four.setChecked(false);
                five.setChecked(false);
                six.setChecked(false);
                seven.setChecked(false);
                eight.setChecked(false);
                nine.setChecked(false);
                ten.setChecked(false);
                eleven.setChecked(false);
                twelve.setChecked(false);
                thirteen.setChecked(false);

                NOne.setChecked(false);
                NTwo.setChecked(false);
                NThree.setChecked(false);
                NFour.setChecked(false);
                NFive.setChecked(false);
                NSix.setChecked(false);
                NSeven.setChecked(false);
                NEight.setChecked(false);
                NNine.setChecked(false);
                NTen.setChecked(false);
                NEleven.setChecked(false);
                NTwelve.setChecked(false);
                NThirteen.setChecked(false);

                SOne.setChecked(false);
                STwo.setChecked(false);
                SThree.setChecked(false);
                SFour.setChecked(false);
                SFive.setChecked(false);
                SSix.setChecked(false);
                SSeven.setChecked(false);
                SEight.setChecked(false);
                SNine.setChecked(false);
                STen.setChecked(false);
                SEleven.setChecked(false);
                STwelve.setChecked(false);
                SThirteen.setChecked(false);

                getActivity().recreate();

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear.setVisibility(View.VISIBLE);

                if((NOne.isChecked() || SOne.isChecked()) && (NTwo.isChecked() || STwo.isChecked()) &&(NThree.isChecked() || SThree.isChecked()) &&(NFour.isChecked() || SFour.isChecked()) &&(NFive.isChecked() || SFive.isChecked()) &&(NSix.isChecked() || SSix.isChecked()) &&(NSeven.isChecked() || SSeven.isChecked()) &&(NEight.isChecked() || SEight.isChecked()) &&(NNine.isChecked() || SNine.isChecked()) &&(NTen.isChecked() || STen.isChecked()) &&(NEleven.isChecked() || SEleven.isChecked()) &&(NTwelve.isChecked() || STwelve.isChecked()) &&(NThirteen.isChecked() || SThirteen.isChecked())){
                    tv00.setVisibility(View.VISIBLE);
                } else {
                    tv00.setVisibility(View.VISIBLE);
                    tv00.setText("<--Results-->");
                    tv00.setTextColor(getResources().getColor(R.color.colorBlack));
                    tv014.setVisibility(View.VISIBLE);
                    if (one.isChecked()) {
                        tv01.setVisibility(View.VISIBLE);
                        tv1.setVisibility(View.VISIBLE);
                        tv01.setText("You have FEVER.");
                        tv01.setTextColor(getResources().getColor(R.color.color_red));
                        tv1.setText("How to Break a  FEVER\n"+"\n1.Take your temperature and assess your symptoms. If your temperature runs 100.4°F (38°C) or higher, you have a fever.\n" +
                                "2. Stay in bed and rest.\n" +
                                "3. Keep hydrated. Drinking water, iced tea, or very diluted juice to replenish fluids lost through sweating. But if keeping liquids down is difficult, suck on ice chips.\n" +
                                "4. Take over-the-counter medications like acetaminophen and ibuprofen to reduce fever. Note the proper dosage, and don’t them use alongside other fever-reducing medications. You shouldn’t give aspirin to your baby or child without consulting your doctor. Infants under 6 months of age shouldn’t be given ibuprofen.\n" +
                                "5. Stay cool. Remove extra layers of clothing and blankets, unless you have the chills.\n" +
                                "6. Take tepid baths or using cold compresses to make you more comfortable. Cold baths, ice cube baths, or alcohol baths or rubs can be dangerous and should be avoided.\n" +
                                "7. But no matter what the number on the thermometer reads, if you have any concerns consult your doctor.\n");
                    } else {
                        tv01.setVisibility(View.VISIBLE);
                        tv01.setTextColor(getResources().getColor(R.color.color_green));
                        tv01.setText("You don't have FEVER.");
                    }
                    if (two.isChecked()) {
                        tv02.setVisibility(View.VISIBLE);
                        tv2.setVisibility(View.VISIBLE);
                        tv02.setText("You have DRY COUGH.");
                        tv02.setTextColor(getResources().getColor(R.color.color_red));
                        tv2.setText("How to Clam the COUGH\n\n" +
                                "1. Use a humidifier to make the air moist, or breathe steam from a hot shower or teakettle before bed.\n" +
                                "2. Raise your head up a bit with an extra pillow.\n" +
                                "3. Try a saline or saltwater nose spray.\n" +
                                "4. Swallow a teaspoon of honey. ...\n" +
                                "5. Sip warm tea or soup.\n" +
                                "6. Suck on menthol or honey lozenges before bedtime.\n");
                    } else {
                        tv02.setVisibility(View.VISIBLE);
                        tv02.setTextColor(getResources().getColor(R.color.color_green));
                        tv02.setText("You don't have DRY COUGH.");
                    }
                    if (three.isChecked()) {
                        tv03.setVisibility(View.VISIBLE);
                        tv3.setVisibility(View.VISIBLE);
                        tv03.setText("You have TIREDNESS.");
                        tv03.setTextColor(getResources().getColor(R.color.color_red));
                        tv3.setText("15 ways to Combat TIREDNESS\n\n" +
                                "1. Eat a balanced diet.\n" +
                                "2. Get regular exercise.\n" +
                                "3. Drink more water.\n" +
                                "4. Cut down on caffeine.\n" +
                                "5. Get good sleep.\n" +
                                "6. Ditch the alcohol.\n" +
                                "7. Address allergies.\n" +
                                "8. Reduce stress.\n"+
                                "9. Do a mental health check\n"+
                                "10. Sit less work more\n"+
                                "11. Prioritize iron-rich foods\n"+
                                "12. Have smaller, more frequent meals\n"+
                                "13. Quit smoking\n"+
                                "14. Learn to relax\n"+
                                "15. Talk to your doctor\n");
                    } else {
                        tv03.setVisibility(View.VISIBLE);
                        tv03.setTextColor(getResources().getColor(R.color.color_green));
                        tv03.setText("You don't have TIREDNESS.");
                    }
                    if (four.isChecked()) {
                        tv04.setVisibility(View.VISIBLE);
                        tv4.setVisibility(View.VISIBLE);
                        tv04.setText("You have ACHES and PAINS.");
                        tv04.setTextColor(getResources().getColor(R.color.color_red));
                        tv4.setText("Natural Remedies for BODY ACHES AND PAINS\n\n" +
                                "1. Epsom Salt Soak. A classic remedy for sore muscles and joints is to take a relaxing bath with Epsom Salts. ...\n" +
                                "2. Hot and Cold Packs. ...\n" +
                                "3. Getting Enough Movement & Exercise. ...\n" +
                                "4. Collagen & Other Natural Supplements. ...\n" +
                                "5. Neurologically-Based Chiropractic Care.\n");
                    } else {
                        tv04.setVisibility(View.VISIBLE);
                        tv04.setTextColor(getResources().getColor(R.color.color_green));
                        tv04.setText("You don't have ACHES and PAINS.");
                    }
                    if (five.isChecked()) {
                        tv05.setVisibility(View.VISIBLE);
                        tv5.setVisibility(View.VISIBLE);
                        tv05.setText("You have SORE THROAT.");
                        tv05.setTextColor(getResources().getColor(R.color.color_red));
                        tv5.setText("12 Natural Remedies for SORE THROAT\n\n"+
                                "1. Honey\n"+
                                "2. Salt water\n"+
                                "3. Chamomile tea\n"+
                                "4. Peppermint\n"+
                                "5. Baking soda gargle\n"+
                                "6. Fenugreek\n"+
                                "7. Marshmallow root\n"+
                                "8. Licorice root\n"+
                                "9. Slippery elm\n"+
                                "10. Apple cider vinegar\n"+
                                "11. Garlic\n"+
                                "12. Cayenne pepper or hot sauce\n");
                    } else {
                        tv05.setVisibility(View.VISIBLE);
                        tv05.setTextColor(getResources().getColor(R.color.color_green));
                        tv05.setText("You don't have SORE THROAT.");
                    }
                    if (six.isChecked()) {
                        tv06.setVisibility(View.VISIBLE);
                        tv6.setVisibility(View.VISIBLE);
                        tv06.setText("You have DIARRHEA.");
                        tv06.setTextColor(getResources().getColor(R.color.color_red));
                        tv6.setText("Treatment Options for DIARRHEA\n\n" +
                                " The treatment for diarrhea usually requires replacing lost fluids. This simply means you need to drink more water or electrolyte replacement beverages, such as sports drinks.\n" +
                                "In more serious cases, you may get fluids through intravenous therapy. If a bacterial infection is the cause of your diarrhea, your doctor may prescribe antibiotics.\n" +
                                "\nYour doctor will decide your treatment based on:\n\n" +
                                "1. The severity of the diarrhea and related condition\n" +
                                "2. The frequency of the diarrhea and related condition\n" +
                                "3. The degree of your dehydration status\n" +
                                "4. Your health\n" +
                                "5. Your medical history\n" +
                                "6. Your age\n" +
                                "7. Your ability to tolerate different procedures or medications\n" +
                                "8. Expectations for improvement of your condition\n");
                    } else {
                        tv06.setVisibility(View.VISIBLE);
                        tv06.setTextColor(getResources().getColor(R.color.color_green));
                        tv06.setText("You don't have DIARRHEA.");
                    }
                    if (seven.isChecked()) {
                        tv07.setVisibility(View.VISIBLE);
                        tv7.setVisibility(View.VISIBLE);
                        tv07.setText("You have CONJUNCTIVITIS.");
                        tv07.setTextColor(getResources().getColor(R.color.color_red));
                        tv7.setText("Home Remedies for CONJUNTIVITIS\n\n" +
                                "1. Apply a compress to your eyes. To make a compress, soak a clean, lint-free cloth in water and wring it out before applying it gently to your closed eyelids. ...\n" +
                                "2. Try eyedrops. Over-the-counter eyedrops called artificial tears may relieve symptoms. ...\n" +
                                "3. Stop wearing contact lenses\n");
                    }
                    else {
                        tv07.setVisibility(View.VISIBLE);
                        tv07.setTextColor(getResources().getColor(R.color.color_green));
                        tv07.setText("You don't have CONJUNCTIVITIS.");
                    }
                    if (eight.isChecked()) {
                        tv08.setVisibility(View.VISIBLE);
                        tv8.setVisibility(View.VISIBLE);
                        tv08.setText("You have HEADACHE.");
                        tv08.setTextColor(getResources().getColor(R.color.color_red));
                        tv8.setText("18 Effective Home Remedies to get Rid of HEADACHE.\n\n" +
                                "1. Drink Water. Inadequate hydration may lead you to develop a headache. ...\n" +
                                "2. Take Some Magnesium. ...\n" +
                                "3. Limit Alcohol. ...\n" +
                                "4. Get Adequate Sleep. ...\n" +
                                "5. Avoid Foods High in Histamine. ...\n" +
                                "6. Use Essential Oils. ...\n" +
                                "7. Try a B-Complex Vitamin. ...\n" +
                                "8. Soothe Pain with a Cold Compress.\n"+
                                "9. Consider Taking Coenzyme Q10\n" +
                                "**Coenzyme Q10 (CoQ10) is a substance produced naturally by the body that helps turn food into energy and functions as a powerful antioxidant\n"+
                                "10. Try an Elimination Diet\n" +
                                "\nStudies suggest that food intolerances can trigger headaches in some people.\n\n" +
                                "To discover if a certain food is causing frequent headaches, try an elimination diet that removes the foods most related to your headache symptoms.\n\n"+
                                "11. Drink Caffeinated Tea or Coffee\n"+
                                "12. Try Acupuncture\n"+
                                "13. Relax with Yoga\n"+
                                "14. Avoid Strong Smells\n"+
                                "15. Try an Herbal Remedy\n"+
                                "16. Avoid Nitrates and Nitrites\n"+
                                "17. Sip Some Ginger Tea\n"+
                                "18. Get Some Exercise\n");
                    } else {
                        tv08.setVisibility(View.VISIBLE);
                        tv08.setTextColor(getResources().getColor(R.color.color_green));
                        tv08.setText("You don't have HEADACHE.");
                    }
                    if (nine.isChecked()) {
                        tv09.setVisibility(View.VISIBLE);
                        tv9.setVisibility(View.VISIBLE);
                        tv09.setText("You have LOSS of SMELL or TASTE.");
                        tv09.setTextColor(getResources().getColor(R.color.color_red));
                        tv9.setText("Treatments for IMPAIRED SMELL\n\n" +
                                "Impaired smell caused by a viral or bacterial infection is often short-lived. If you have a bacterial infection, you may be given antibiotics to speed up the healing process. This will help to restore smell. Decongestants and OTC antihistamines can help relieve nasal congestion caused by allergies.\n\n" +
                                "If you have a stuffy nose and are unable to blow your nose, use a humidifier to moisten the air. Keeping a humidifier in your home can loosen mucus and help relieve congestion.\n\n" +
                                "If a neurological disease, tumor, or other disorder causes your impaired smell, you’ll receive treatment for the underlying condition. Some cases of impaired smell may be permanent.\n");
                    } else {
                        tv09.setVisibility(View.VISIBLE);
                        tv09.setTextColor(getResources().getColor(R.color.color_green));
                        tv09.setText("You don't have LOSS of SMELL or TASTE.");
                    }
                    if (ten.isChecked()) {
                        tv010.setVisibility(View.VISIBLE);
                        tv10.setVisibility(View.VISIBLE);
                        tv010.setText("You have RASHES in Skin or DISCOLOURATION of Fingers or Toes.");
                        tv010.setTextColor(getResources().getColor(R.color.color_red));
                        tv10.setText("Medical Treatments for SKIN or DISCOLOURATION of Fingers or Toes\n\n" +
                                "1. Laser therapy: Intense pulsed light devices and Q-switched lasers are commonly used to help lighten skin areas that have darkened.\n" +
                                "2. Topical creams: Topical hydroquinone or prescription retinol (vitamin A) cream may help decrease the appearance of dark skin patches.\n" +
                                "3. Chemical peels: Chemical peels containing salicylic acid and glycolic acid can be used to remove the outer, discolored layer of skin.\n" +
                                "\n  Talk to your healthcare provider about your options so you can determine which treatment is best for you. Make sure to discuss the side effects, cost, and effectiveness of each treatment.\n" +
                                "\nHome Treatments\n\n" +
                                "1. Over-the-counter creams: Vitamin A cream or vitamin E cream can help reduce the appearance of skin discoloration and boost overall skin health.\n" +
                                "2. Lemon juice: Apply lemon juice twice per day to lighten skin areas that have darkened. This may reduce the appearance of discolored skin patches in six to eight weeks.\n" +
                                "3. Castor oil: Apply castor oil to discolored areas twice per day, or wear a bandage soaked in castor oil overnight. This can help smooth the skin and break down excess melanin.\n" +
                                "4. Vitamin C: Eat foods rich in vitamin C, an essential nutrient for skin health. Fruits high in vitamin C include cantaloupe, oranges, and pineapple.\n" +
                                "5. Drink tea: Drinking tea made from burdock, red clover, or milk thistle might reduce skin discoloration.\n");
                    } else {
                        tv010.setVisibility(View.VISIBLE);
                        tv010.setTextColor(getResources().getColor(R.color.color_green));
                        tv010.setText("You don't have RASHES in Skin or DISCOLOURATION of Fingers or Toes..");
                    }
                    if (eleven.isChecked()) {
                        tv011.setVisibility(View.VISIBLE);
                        tv11.setVisibility(View.VISIBLE);
                        tv011.setText("You have DIFFICULTY in BREATHING. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                        tv011.setTextColor(getResources().getColor(R.color.color_red));
                        tv11.setText("Treatment for DIFFICULTY IN BREATING[IT IS A SERIOUS SYMPTOM OF COVID-19]\n\n" +
                                "Treating dyspnea usually means treating its underlying cause.\n" +
                                "\n" +
                                "Diet and exercise\n" +
                                "If obesity and a poor fitness level are the cause of dyspnea you may be experiencing, eat healthier meals and exercise frequently. If it’s been a long time or you have a medical condition that limits your activity level, talk with your doctor about how to begin a safe exercise routine.\n" +
                                "\n" +
                                "Pulmonary rehabilitation\n" +
                                "COPD and other lung problems require the care of a pulmonologist, a doctor who specializes in the health of your lungs and respiratory system. You may need supplemental oxygen in a portable tank to help keep you from feeling out of breath. Pulmonary rehabilitation may also be helpful. This is a program of supervised exercise and education about breathing techniques to help you overcome lung disease.\n" +
                                "\n" +
                                "Cardiac rehabilitation\n" +
                                "Heart-related causes are treated by a cardiologist, a doctor specializing in heart disorders. If you have heart failure, it means your heart is too weak to pump enough oxygenated blood to meet your body’s requirements. Dyspnea is one of several symptoms of heart failure. Cardiac rehabilitation can help you manage heart failure and other heart-related conditions. In serious cases of heart failure, an artificial pump may be needed to take over the blood pumping duties of a weakened heart.\n");
                    } else {
                        tv011.setVisibility(View.VISIBLE);
                        tv011.setTextColor(getResources().getColor(R.color.color_green));
                        tv011.setText("You don't have DIFFICULTY in BREATHING. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                    }
                    if (twelve.isChecked()) {
                        tv012.setVisibility(View.VISIBLE);
                        tv12.setVisibility(View.VISIBLE);
                        tv012.setText("You have CHEST PAIN or PRESSURE. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                        tv012.setTextColor(getResources().getColor(R.color.color_red));
                        tv12.setText("10 Home Remedies for HEART PAIN[IT IS A SERIOUS SYMPTOM OF COVID-19]\n\n" +
                                "1. Almonds. When acid reflux is to blame for the heart pain, eating a few almonds or drinking a cup of almond milk may help. ...\n" +
                                "2. Cold pack. A common cause of heart or chest pain is a muscle strain. ...\n" +
                                "3. Hot drinks. ...\n" +
                                "4. Baking soda. ...\n" +
                                "5. Garlic. ...\n" +
                                "6. Apple cider vinegar. ...\n" +
                                "7. Aspirin. ...\n" +
                                "8. Lie down.\n"+
                                "9. Ginger\n"+
                                "10. Turmeric milk\n");
                    } else {
                        tv012.setVisibility(View.VISIBLE);
                        tv012.setTextColor(getResources().getColor(R.color.color_green));
                        tv012.setText("You don't have CHEST PAIN. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                    }
                    if (thirteen.isChecked()) {
                        tv013.setVisibility(View.VISIBLE);
                        tv13.setVisibility(View.VISIBLE);
                        tv013.setText("You have LOSS of SPEECH or MOVEMENT. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                        tv013.setTextColor(getResources().getColor(R.color.color_red));
                        tv13.setText("Treatment for SPEECH DISORDER[IT IS A SERIOUS SYMPTOM OF COVID-19]\n\n"+
                                "The type of treatment will typically depend on the severity of the speech disorder and its underlying cause.\n" +
                                "\n" +
                                "Treatment options can include:\n" +
                                "\n" +
                                "1. speech therapy exercises that focus on building familiarity with certain words or sounds\n" +
                                "2. physical exercises that focus on strengthening the muscles that produce speech sounds\n" +
                                "We discuss some of the treatment options for speech disorders below:\n" +
                                "\n" +
                                "Target selection\n" +
                                "Target selection involves a person practicing specific sounds or words to familiarize themselves with particular speech patterns. Examples of therapy targets may include difficult words or sounds that trigger speech disruptions.\n" +
                                "\n" +
                                "Contextual utilization\n" +
                                "For this approach, SLPs teach people to recognize speech sounds in different syllable-based contexts.\n" +
                                "\n" +
                                "Contrast therapy\n" +
                                "Contrast therapy involves saying word pairs that contain one or more different speech sounds. An example word pair might be “beat” and “feet” or “dough” and “show.”\n" +
                                "\n" +
                                "Oral-motor therapy\n" +
                                "The oral-motor therapy approach focuses on improving muscle strength, motor control, and breath control. These exercises can help people develop fluency, which produces smoother speech that sounds more natural.\n" +
                                "\n" +
                                "Ear device\n" +
                                "Ear devices are small electronic aids that fit inside the ear canal. These devices can help improve fluency in people who have a stutter.\n" +
                                "\n" +
                                "Some ear devices replay altered versions of the wearer’s voice to make it seem as though someone else is speaking with them. Other ear devices produce a noise that helps control stuttering.\n" +
                                "\n" +
                                "Medication\n" +
                                "Some speech disorders can cause people to develop anxiety disorders. Stressful situations can trigger anxiety, resulting in more pronounced speech disorder symptoms. Anxiety medications may help reduce symptoms of speech disorders in some people.\n" +
                                "\nTREATING MOVEMENT DISORDERS[IT IS A SERIOUS SYMPTOM OF COVID-19]\n\n" +
                                "In many cases, movement disorders cannot be cured, and the goal of treatment is to minimize symptoms and relieve pain. Some are severe and progressive, impairing your ability to move and speak. While treatment for movement disorders will depend on the underlying cause of your condition, options your doctor may suggest include:\n" +
                                "\n" +
                                "Drug therapies to control your symptoms\n" +
                                "Physical or occupational therapy to help maintain or restore your ability to control your movements\n" +
                                "Botulinum toxin injections to help prevent muscle contractions\n" +
                                "Deep brain stimulation, a surgical treatment option that uses an implant to stimulate the areas of your brain that controls movement\n");
                    } else {
                        tv013.setVisibility(View.VISIBLE);
                        tv013.setTextColor(getResources().getColor(R.color.color_green));
                        tv013.setText("You don't have LOSS of SPEECH or MOVEMENT. [IT IS A SERIOUS SYMPTOM OF COVID-19]");
                    }
                }
            }

        });

        return view;
    }

    public void onButtonPressed(Uri uri) {
        if(mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
