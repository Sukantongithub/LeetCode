bool isValid(char* s) {   
    int size=strlen(s);
    int top=-1;
    int stack[size];
    for(int i;i<=size;i++){
        if(s[i]=='{'||s[i]=='['||s[i]=='('){
            top++;
            stack[top]=s[i];
        }
        else if (s[i] == '}' || s[i] == ']' || s[i] == ')'){
            if (top == -1) return false;
            else if( (s[i]==']' && stack[top]=='[') || (s[i]=='}' && stack[top]=='{') || (s[i]==')' && stack[top]=='(') ){
                top--;
            } else return false;
        }
    }
    if(top==-1) return true;
    else return false;
}