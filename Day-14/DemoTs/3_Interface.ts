interface onCreate{
    create:string;
    init():string;
}

class employee implements onCreate{
    init(): string {
        return "";
    }
    create: string;
}