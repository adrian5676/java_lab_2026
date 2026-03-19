import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator{
    private String transform;

    public TransformationDecorator(Shape decoratedShape, String transform) {
        super(decoratedShape);
        Builder builder = new Builder().translate(translation);

    }
    @Override
    public String toSvg(){
        return this.decoratedShape.toSvg().replace("/>", String.format(" transform=\"%s\"/>", transform));
    }

    public static class Builder{
        private Builder builder;

    private Vec2 translation;
    private double rotation;
    private Vec2 scale;



        public Builder translate(Vec2 translation){
        this.translation = translation;
        }

        public String build(){
            if (translation != null) {
                String.format(Locale.ENGLISH, " translate(%f %f)", translation.x(), translation.y());
            }
        }
    }
}
/*
youll take my life but ill take yours too!
youll fire your musket but ill run you through!
so when youre waitin fo the next attack...
youd better stand theres no turning back!
the bugle sounds , the charge begins!
but on this battlefield no one wins...
the smell of acrid smoke and horses breath!
as i plunge on into certain death

the horse it sweats with fear we break to run!
the mighty roar of the russian guns...
and as we race towards the human wall
the screams of pain as my comrades fall!
we hurdle bodies that lay on the ground
and the russians fire another round
we get so near yet so far away
we wont life to fight another day

we get so clodasse, near enough to fight!
when a russian gets me in his sights
he pulls the trigger and i feel the blow..
the bullet strikes on my horse below
as i lay there gazing at the sky!
my bodys numb and my throat is dry..
and as i lay there forgotten and alone
without a tear i draw my parting groan
*/
