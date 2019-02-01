package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class Controllers {

    public static WPI_TalonSRX LEFT_DRIVE1_T   = new WPI_TalonSRX(16);
    public static WPI_VictorSPX LEFT_DRIVE2_V  = new WPI_VictorSPX(15);
    public static WPI_VictorSPX LEFT_DRIVE3_V  = new WPI_VictorSPX(14);

    public static WPI_TalonSRX RIGHT_DRIVE1_T  = new WPI_TalonSRX(1);
    public static WPI_VictorSPX RIGHT_DRIVE2_V = new WPI_VictorSPX(2);
    public static WPI_VictorSPX RIGHT_DRIVE3_V = new WPI_VictorSPX(3);

    public static VictorSPX CLIMBER1_V    = new VictorSPX(4);
    public static VictorSPX CLIMBER2_V    = new VictorSPX(13);

    public static TalonSRX ELEVATOR1_T    = new TalonSRX(5);
    public static TalonSRX ELEVATOR2_T    = new TalonSRX(12);

    public static TalonSRX INTAKETOP_T    = new TalonSRX(6);
    public static TalonSRX INTAKEBOTTOM_T = new TalonSRX(7);
    public static TalonSRX INTAKEPIVOT_T  = new TalonSRX(12);

    public static void init() {
        LEFT_DRIVE1_T.setNeutralMode(NeutralMode.Brake);
        LEFT_DRIVE2_V.setNeutralMode(NeutralMode.Brake);
        LEFT_DRIVE3_V.setNeutralMode(NeutralMode.Brake);

        LEFT_DRIVE2_V.follow(LEFT_DRIVE1_T);
        LEFT_DRIVE3_V.follow(LEFT_DRIVE1_T);

        RIGHT_DRIVE1_T.setNeutralMode(NeutralMode.Brake);
        RIGHT_DRIVE2_V.setNeutralMode(NeutralMode.Brake);
        RIGHT_DRIVE3_V.setNeutralMode(NeutralMode.Brake);

        RIGHT_DRIVE2_V.follow(RIGHT_DRIVE1_T);
        RIGHT_DRIVE3_V.follow(RIGHT_DRIVE1_T);

        CLIMBER1_V.setNeutralMode(NeutralMode.Brake);
        CLIMBER2_V.setNeutralMode(NeutralMode.Brake);

        ELEVATOR1_T.setNeutralMode(NeutralMode.Brake);
        ELEVATOR2_T.setNeutralMode(NeutralMode.Brake);

        INTAKETOP_T.setNeutralMode(NeutralMode.Brake);
        INTAKEBOTTOM_T.setNeutralMode(NeutralMode.Brake);
        INTAKEPIVOT_T.setNeutralMode(NeutralMode.Brake); 
    }
}