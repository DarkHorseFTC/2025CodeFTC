package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp
public class TestOpModesavi extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Servo myServo = hardwareMap.get(Servo.class, "servo1")

        waitForStart ();

        while (opModeIsActive()) {
                }
            }
            myServo.setPosition(.26);
        }
    }
}
